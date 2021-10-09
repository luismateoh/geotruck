package co.edu.udea.geotruck.controller;


import co.edu.udea.geotruck.dto.CargaDto;
import co.edu.udea.geotruck.service.CargaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;


@RestController
@RequestMapping(path = "/v1/cargas")
@Validated
public class CargaController {

    private final CargaService cargaService;

    public CargaController(CargaService cargaService) {
        this.cargaService = cargaService;
    }

    @PostMapping
    public ResponseEntity<CargaDto> create(@RequestBody @Valid CargaDto cargaDTO) {
        CargaDto cargaCreate = cargaService.create(cargaDTO);
        return new ResponseEntity<CargaDto>(cargaCreate, null, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<CargaDto> update(@RequestBody @Valid CargaDto cargaDTO) {
        return ResponseEntity.ok(cargaService.update(cargaDTO));
    }

    @GetMapping
    public ResponseEntity<List<CargaDto>> findAll() {
        return ResponseEntity.ok(cargaService.findAll());
    }

    @Validated
    @GetMapping("/{id}")
    public ResponseEntity<CargaDto> findById(
            @PathVariable @NotNull @Valid Long id) {
        return ResponseEntity.ok(cargaService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        cargaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
