package com.mss.mfc.menuitems.datasource;

import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatasourceLocator {
	@Bean
	public DataSource getDataSource() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
		dataSourceBuilder.url("jdbc:mysql://172.17.12.173:3306/mfc");
		dataSourceBuilder.username("Miracle");
		dataSourceBuilder.password("Miracle@000");
		return dataSourceBuilder.build();
		}	
}
