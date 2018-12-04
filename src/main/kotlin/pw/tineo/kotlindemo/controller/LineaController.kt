package pw.tineo.kotlindemo.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import pw.tineo.kotlindemo.model.Linea
import pw.tineo.kotlindemo.repository.LineaRepository
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class LineaController(private val lineaRepository: LineaRepository) {
    @GetMapping("/linea")
    fun getAllParaderos(): List<Linea> {
        return lineaRepository.findAll()
    }

    @PostMapping("/linea")
    fun createNewParadero(@Valid @RequestBody linea: Linea): Linea =
            lineaRepository.save(linea)

    @DeleteMapping("/linea/{id}")
    fun deleteArticleById(@PathVariable(value = "id") lineaId: Long): ResponseEntity<Void> {

        return lineaRepository.findById(lineaId).map { linea  ->
            lineaRepository.delete(linea)
            ResponseEntity<Void>(HttpStatus.OK)
        }.orElse(ResponseEntity.notFound().build())


    }
}