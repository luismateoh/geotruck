package co.edu.udea.geotruck.controller;


import co.edu.udea.geotruck.service.RutaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;


@RestController
@RequestMapping(path = "/v1/rutas")
@Validated
public class RutaController {

    private final RutaService rutaService;

    public RutaController(RutaService rutaService) {
        this.rutaService = rutaService;
    }

    @PostMapping
    public ResponseEntity<RutaDto> create(@RequestBody @Valid RutaDto rutaDto) {
        RutaDto personCreate = rutaService.create(rutaDto);
        return new ResponseEntity<RutaDto>(personCreate, null, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<RutaDto> update(@RequestBody @Valid RutaDto rutaDto) {
        return ResponseEntity.ok(rutaService.update(rutaDto));
    }

    @GetMapping
    public ResponseEntity<List<RutaDto>> findAll() {
        return ResponseEntity.ok(rutaService.findAll());
    }

    @Validated
    @GetMapping("/{id}")
    public ResponseEntity<RutaDto> findById(
            @PathVariable @NotNull @Valid Long id) {
        return ResponseEntity.ok(rutaService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        rutaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
