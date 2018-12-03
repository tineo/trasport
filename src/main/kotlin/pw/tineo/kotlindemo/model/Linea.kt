package pw.tineo.kotlindemo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.SequenceGenerator
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity
data class Linea (
        @Id @GeneratedValue(strategy = GenerationType.AUTO) @SequenceGenerator(name="seq_linea_gen", sequenceName="seq_linea")

        val id: Long = 0,

        @get: NotBlank
        val nombre: String = ""

        //@get: NotBlank
        //val content: String = ""
)