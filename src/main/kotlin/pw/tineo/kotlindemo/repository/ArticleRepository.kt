package pw.tineo.kotlindemo.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import pw.tineo.kotlindemo.model.Article

@Repository
interface ArticleRepository : JpaRepository<Article, Long>