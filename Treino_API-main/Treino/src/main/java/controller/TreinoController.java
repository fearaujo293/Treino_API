package controller;

import DTO.TreinoDTO;

import Model.TreinoModel;
import Service.TreinoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Treinos")
public class TreinoController {

    private final TreinoService service;

    public TreinoController(TreinoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<TreinoDTO>> listarTodos() {
        List<TreinoDTO> treinos = service.listarTodos()
                .stream()
                .map(TreinoDTO::fromModel)
                .collect(Collectors.toList());
        return ResponseEntity.ok(treinos);
    }


    @GetMapping("/{id}")
    public ResponseEntity<TreinoDTO> buscarPorId(@PathVariable Long id) {
        TreinoModel treino = service.buscarPorId(id);
        if (treino != null) {
            return ResponseEntity.ok(TreinoDTO.fromModel(treino));
        }
        return ResponseEntity.notFound().build();
    }


    @PostMapping
    public ResponseEntity<TreinoDTO> criar(@RequestBody TreinoDTO dto) {
        TreinoModel salvo = service.salvar(dto.toModel());
        return ResponseEntity.ok(TreinoDTO.fromModel(salvo));
    }

        @PutMapping("/{id}")
        public ResponseEntity<TreinoDTO> atualizar(@PathVariable Long id, @RequestBody TreinoDTO dto) {
        TreinoModel atualizado = service.atualizar(id, dto.toModel());
        return ResponseEntity.ok(TreinoDTO.fromModel(atualizado));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}