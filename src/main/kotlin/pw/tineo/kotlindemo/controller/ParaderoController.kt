package pw.tineo.kotlindemo.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import pw.tineo.kotlindemo.model.Paradero
import javax.validation.Valid
import pw.tineo.kotlindemo.repository.ParaderoRepository

@RestController
@RequestMapping("/api")
class ParaderoController(private val paraderoRepository: ParaderoRepository) {
    @GetMapping("/paraderos")
    fun getAllParaderos(): List<Paradero> {
           return paraderoRepository.findAll()
    }

    @PostMapping("/paraderos")
    fun createNewParadero(@Valid @RequestBody paradero: Paradero): Paradero =
            paraderoRepository.save(paradero)

    @DeleteMapping("/paraderos/{id}")
    fun deleteArticleById(@PathVariable(value = "id") paraderoId: Long): ResponseEntity<Void> {

        return paraderoRepository.findById(paraderoId).map { paradero  ->
            paraderoRepository.delete(paradero)
            ResponseEntity<Void>(HttpStatus.OK)
        }.orElse(ResponseEntity.notFound().build())
    }
}