package pw.tineo.kotlindemo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.SequenceGenerator
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity
data class Ruta (
        @Id @GeneratedValue(strategy = GenerationType.AUTO) @SequenceGenerator(name="seq_ruta_gen", sequenceName="seq_ruta")

        val id: Long = 0,

        @get: NotBlank
        val direccion_inicio: String = "",

        @get: NotBlank
        val direccion_final: String = "",

        @get: NotBlank
        val dist_recorrida: String = "",

        @get: NotBlank
        val ptos_recorrido: String = ""

        //@get: NotBlank
        //val content: String = ""
)