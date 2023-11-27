package Monitoramento

import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate

class Parametro {
    var critico: Double = 0.0
    var alerta: Double = 0.0
    var fkComponente: Int = 0


}