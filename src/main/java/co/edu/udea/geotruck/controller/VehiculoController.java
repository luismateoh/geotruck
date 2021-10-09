package co.edu.udea.geotruck.controller;

import co.edu.udea.geotruck.dto.VehiculoDto;
import co.edu.udea.geotruck.service.VehiculoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;


@RestController
@RequestMapping(path = "/v1/vehiculos")
@Validated
public class VehiculoController {

    private final VehiculoService vehiculoService;

    public VehiculoController(VehiculoService vehiculoService) {
        this.vehiculoService = vehiculoService;
    }

    @PostMapping
    public ResponseEntity<VehiculoDto> create(@RequestBody @Valid VehiculoDto vehiculoDto) {
        VehiculoDto personCreate = vehiculoService.create(vehiculoDto);
        return new ResponseEntity<VehiculoDto>(personCreate, null, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<VehiculoDto> update(@RequestBody @Valid VehiculoDto vehiculoDto) {
        return ResponseEntity.ok(vehiculoService.update(vehiculoDto));
    }

    @GetMapping
    public ResponseEntity<List<VehiculoDto>> findAll() {
        return ResponseEntity.ok(vehiculoService.findAll());
    }

    @Validated
    @GetMapping("/{id}")
    public ResponseEntity<VehiculoDto> findById(
            @PathVariable @NotNull @Valid Long id) {
        return ResponseEntity.ok(vehiculoService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        vehiculoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
