package co.edu.udea.geotruck.controller;


import co.edu.udea.geotruck.service.RolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;


@RestController
@RequestMapping(path = "/v1/people")
@Validated
public class RolController {

    private final RolService rolService;

    public RolController(RolService rolService) {
        this.rolService = rolService;
    }

    @PostMapping
    public ResponseEntity<RolDto> create(@RequestBody @Valid RolDto rolDto) {
        RolDto personCreate = rolService.create(rolDto);
        return new ResponseEntity<RolDto>(personCreate, null, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<RolDto> update(@RequestBody @Valid RolDto rolDto) {
        return ResponseEntity.ok(rolService.update(rolDto));
    }

    @GetMapping
    public ResponseEntity<List<RolDto>> findAll() {
        return ResponseEntity.ok(rolService.findAll());
    }

    @Validated
    @GetMapping("/{id}")
    public ResponseEntity<RolDto> findById(
            @PathVariable @NotNull @Valid Long id) {
        return ResponseEntity.ok(rolService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        rolService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
