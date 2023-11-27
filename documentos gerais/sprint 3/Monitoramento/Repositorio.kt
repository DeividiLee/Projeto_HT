package Monitoramento

import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate

class Repositorio {
    lateinit var jdbcTemplate: JdbcTemplate

    fun iniciar() {
        jdbcTemplate = Conexao().conectar()
    }

    fun cadastrar(novoDado: Porcentagem) {
        jdbcTemplate.update("""
        insert into Monitoramento () 
        values
            ()            
        """)
    }
    fun getUltimoCodigo():Int {
        val ultimoCodigo = jdbcTemplate.queryForObject("""
        select max(codigo) from Monitoramento    
        """, Int::class.java
        )

        return ultimoCodigo
    }
    fun recuperarPorcentagem(codigo: Int):Porcentagem {

        val porcentagem = jdbcTemplate.queryForObject("""
        select * from Monitoramento where codigo = $codigo    
        """, BeanPropertyRowMapper(Porcentagem::class.java)
        )

        return porcentagem
    }
    fun recuperarParemetro(codigo: Int):Parametro {

        val parametro = jdbcTemplate.queryForObject("""
        select * from parametro join Componente on fkComponente = idComponente    
        """, BeanPropertyRowMapper(Parametro::class.java)
        )

        return parametro
    }
}