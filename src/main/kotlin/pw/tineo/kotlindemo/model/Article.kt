package pw.tineo.kotlindemo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.SequenceGenerator
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity
data class Article (
        @Id @GeneratedValue(strategy = GenerationType.AUTO) @SequenceGenerator(name="seq_article_gen", sequenceName="seq_article")

        val id: Long = 0,

        @get: NotBlank
        val title: String = "",

        @get: NotBlank
        val content: String = ""
)