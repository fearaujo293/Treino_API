package DTO;

import Model.TreinoModel;

public class TreinoDTO {

    private Long id;
    private String nome;
    private Integer duracao;
    private String descricao;
    private Boolean ativo;

    public TreinoDTO() {
    }

    public TreinoDTO(Long id, String nome, Integer duracao, String descricao, Boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.duracao = duracao;
        this.descricao = descricao;
        this.ativo = ativo;
    }

    // Conversão de Model para DTO
    public static TreinoDTO fromModel(TreinoModel model) {
        if (model == null) return null;
        return new TreinoDTO(
                model.getId(),
                model.getNome(),
                model.getDuracao(),
                model.getDescricao(),
                model.getAtivo()
        );
    }

    // Conversão de DTO para Model
    public TreinoModel toModel() {
        TreinoModel model = new TreinoModel();
        model.setId(this.id);
        model.setNome(this.nome);
        model.setDuracao(this.duracao);
        model.setDescricao(this.descricao);
        model.setAtivo(this.ativo);
        return model;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDuracao() {
        return duracao;
    }
    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getAtivo() {
        return ativo;
    }
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
