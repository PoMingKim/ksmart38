package ksmart38.mybatis.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.jasypt.encryption.StringEncryptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@MapperScan(value="ksmart38.mybatis.dao", sqlSessionFactoryRef="mybatisSqlSessionFactory")
@EnableTransactionManagement
public class MybatisConfig {
	
	
	
	//1.datasource DBCP(Hikari pool 설정)
	@Bean(name="hikariDataSource")
	public DataSource datasource(@Qualifier("jasyptStringEncryptor") StringEncryptor stringEncryptor) {
		
		String jdbcUrl = stringEncryptor.decrypt("eHA3ePN3vJG6XIBveZ0r0o/gZnlJVtdOBJljjl9nD/SP9u6IQLl4ymZEG09TR6/pDAM9BNFmhvSkH8dfJjV7TjSmXxuT7vLdSRsW0/aXhOaPaqGAOCeOMZmnqCEiu3WZEtt/z7mNbkI=");
		String userName = stringEncryptor.decrypt("S+8PSEIu7j94n+2cGOT47Q==");
		String password = stringEncryptor.decrypt("SmQ9IDQi9RlWWgl7tenMGkRKixHvgrqg");
		
		
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
		hikariConfig.setJdbcUrl(jdbcUrl);
		hikariConfig.setUsername(userName);
		hikariConfig.setPassword(password);
		hikariConfig.setMaximumPoolSize(15);
		hikariConfig.setMaxLifetime(1000*60*30);
		return new HikariDataSource(hikariConfig);
	}
	
	//2.Mybatis 연동을 위한 mybatisSqlSessionFactory 설정
	@Bean(name="mybatisSqlSessionFactory")
	public SqlSessionFactory mybatisSqlSessionFactory(@Qualifier("hikariDataSource") DataSource dataSource, ApplicationContext context) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		sqlSessionFactoryBean.setMapperLocations(context.getResources("classpath:mapper/**/*.xml"));
		sqlSessionFactoryBean.setTypeAliasesPackage("ksmart38.mybatis.domain");
		return sqlSessionFactoryBean.getObject();
	}
	
	//2.Mybatis SqlSessionTemplate 설정
	@Bean(name="mybatisSqlSessionTemplate")
	public SqlSessionTemplate mybatisSqlSessionTemplate(
			@Qualifier("mybatisSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
	
	//3.Mybatis TrancationManager 설정
	@Bean(name="mybatisTrancationManager")
	public PlatformTransactionManager trancationManager(@Qualifier("hikariDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
	
	
	
	
	
	
	
	
}
