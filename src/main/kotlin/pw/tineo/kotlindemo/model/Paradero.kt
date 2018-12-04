package pw.tineo.kotlindemo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.SequenceGenerator
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Column

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Entity
data class Paradero (
        @Id @GeneratedValue(strategy = GenerationType.AUTO) @SequenceGenerator(name="seq_paradero_gen", sequenceName="seq_paradero")
        @Column(name = "paraderoid")
        val id: Long = 0,

        @get: NotBlank
        val nombre: String = "",

        @get: NotNull
        val longitud: Double = 0.0,

        @get: NotNull
        val latitud: Double = 0.0


)