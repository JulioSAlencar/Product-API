package io.github.JulioSAlencar.produtosapi.repository;

import io.github.JulioSAlencar.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

    List<Produto> findByName(String name);
}
