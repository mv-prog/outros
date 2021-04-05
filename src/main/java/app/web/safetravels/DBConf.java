package app.web.safetravels;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
@EnableTransactionManagement
public class DBConf {
	@Bean //Bean que hace referencia al origen de los datos
	public DataSource dataSource() {
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
		dataSource.setUrl(env.getProperty("spring.datasource.url"));
		dataSource.setUsername(env.getProperty("spring.datasource.username"));
		dataSource.setPassword(env.getProperty("spring.datasource.password"));
		return dataSource;
	}
	@Bean //
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactory.setDataSource(dataSource);
		//entityManagerFactory.setPackagesToScan(env.getProperty("entityManager.packagesToScan")); //los paquetes que tiene que buscar para escanear las clases anotadas, y que también vendrá en el fichero de properties
		entityManagerFactory.setPackagesToScan("app.web.safetravels");
		entityManagerFactory.setPersistenceUnitName("safetravels");
		HibernateJpaVendorAdapter vendorApdater = new HibernateJpaVendorAdapter(); //como implementación (ie como vendor) de JPA vamos a usar hibernate 
		entityManagerFactory.setJpaVendorAdapter(vendorApdater);//y se lo asignaremos al entity maager factory
		Properties additionalProperties = new Properties();//las ppdades de hibernate que hemos arrastrado hasta antes, que tb se cargarán desde el fichero de properties
		//additionalProperties.put("hibernate.dialect", env.getProperty("hibermate.dialect"));
		additionalProperties.put("spring.jpa.show-sql", env.getProperty("spring.jpa.show-sql"));
		additionalProperties.put("spring.jpa.hibernate.ddl-auto", env.getProperty("spring.jpa.hibernate.ddl-auto"));
		entityManagerFactory.setJpaProperties(additionalProperties);//le indicamos estas propiedades mediante set jpaproperties
		return entityManagerFactory;
	}
	
	@Bean
	public JpaTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory.getObject());
		return transactionManager;
	}
	
	//nos permite relanzar una serie de excepciones de bd a través de las distintas capas para que las podamos utilizar
	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}
	
	@Autowired //Autoinyectaremos lo beans que vamos a crear
	private Environment env;
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private LocalContainerEntityManagerFactoryBean entityManagerFactory;
}
