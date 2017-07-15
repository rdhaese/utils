package com.rdhaese.commons.utils.test.database;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Created on 15/07/2017.
 * 
 * <p>
 * Configured HSQL in memory datasource, declaring as bean is enough.
 * <p>
 * <ul>
 * <li>driverClassName=org.hsqldb.jdbcDriver</li>
 * <li>url=jdbc:hsqldb:mem:paging</li>
 * <li>username=url</li>
 * <li>password=[EMPTY]</li>
 * </ul>
 * <p>
 * Uses {@link DriverManagerDataSource} as a base.
 *
 * @author Robin D'Haese
 * @see DriverManagerDataSource
 * @see javax.sql.DataSource
 */
public class HsqlInMemoryDatasource extends DriverManagerDataSource {

    /**
     * Instantiates a {@link DriverManagerDataSource} with the properties described in the class documentation.
     */
    public HsqlInMemoryDatasource() {
        setDriverClassName("org.hsqldb.jdbcDriver");
        setUrl("jdbc:hsqldb:mem:paging");
        setUsername("sa");
        setPassword("");
    }
}