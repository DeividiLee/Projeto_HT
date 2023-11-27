package Monitoramento

import org.apache.commons.dbcp2.BasicDataSource
import org.springframework.jdbc.core.JdbcTemplate

class Conexao {
    fun conectar(): JdbcTemplate {
        val dataSource = BasicDataSource()
        dataSource.driverClassName = "com.mysql.cj.jdbc.Driver"
        dataSource.url = "mysql://localhost:3306/HealthTouch"
        dataSource.username = "root"
        dataSource.password = "22928512"
        return JdbcTemplate(dataSource)
    }
}