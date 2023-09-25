package com.github.guilhermewolke.estante.domain.book.entity;

public enum BookCategory {
    ACADEMICOS("Acadêmicos"),
    ADMINISTRACAO_E_NEGOCIOS("Administração e negócios"),
    BIOGRAFIAS("Biografias"),
    DESENVOLVIMENTO_PESSOAL("Desenvolvimento pessoal"),
    RELIGIAO_E_ESPIRITUALIDADE("Religião e Espiritualidade"),
    FILOSOFIA_MITOLOGIA_INTELECTUALIDADES("Filosofia, Mitologia e Intelectualidades"),
    FINANCAS_PESSOAIS_E_ECONOMIA("Finanças pessoais e Economia"),
    HISTORIA("História"),
    FICCAO("Ficção"),
    LIVROS_TECNICOS("Livros Técnicos");

    public final String label;
    private BookCategory(String label) {
        this.label = label;
    }
}
