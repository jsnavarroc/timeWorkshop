package com.example.time.configuration;

import com.example.time.configuration.domain.DatabaseCredentials;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfiguration {

    @Bean
    @Profile({"test"})
    public DataSource testDatasource(){
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("classpath:scripts/schema.sql")
                .addScript("classpath:scripts/data.sql")
                .build();
    }

    @Bean
    public DataSource hikariDatasource(DatabaseCredentials credentials){
        HikariConfig config = new HikariConfig();
        String jdbcUrl = String.format("jdbc:postgresql://%s:%s/%s", credentials.getHost(), credentials.getPort(), credentials.getDatabase() );
        config.setJdbcUrl(jdbcUrl);
        config.setDataSourceClassName("org.postgresql.ds.PGSimpleDataSource");
        config.setUsername(credentials.getUsername());
        config.setPassword(credentials.getPassword());

        return new HikariDataSource(config);

    }

}
