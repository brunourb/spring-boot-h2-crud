package br.com.crud.demo.interfaces;

import java.util.List;

public interface GenericOperations<E> {

    /**
     * Quando a pessoa for mandar um post, a aplicação
     * recebe uma entidade(E) e retorna a entidade (e) com o campo
     * id preenchido
     * @param entity
     * @return
     */
    public E post(E entity);

    /**
     * Retorna uma lista de entidades
     * @return
     */
    public List<E> get();

    /**
     * Atualiza um registro
     * @param entity
     */
    public void put(E entity);

    /**
     * Deleta um registro no banco;
     * @param entity
     */
    public void delete(E entity);
}
