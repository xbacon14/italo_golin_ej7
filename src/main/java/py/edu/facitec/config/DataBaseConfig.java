package py.edu.facitec.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataBaseConfig {
	@Bean
	public DataSource getDataSource() {
		DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.url(
				"jdbc:mysql://localhost:3307/practica_bd?useSSL=false&useUnicode=true&serverTimezone=America/Asuncion");
		dataSourceBuilder.username("usuario");
		dataSourceBuilder.password("senha");
		return dataSourceBuilder.build();

	}
}
