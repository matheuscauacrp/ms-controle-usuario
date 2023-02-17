package com.inovacao.senai.netero.servicos.repositorios;

import com.inovacao.senai.netero.modelos.entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmpresaRepositorio extends JpaRepository<Empresa, Long> {

    @Query(value = "select * from tb_empresa where tb_empresa.cnpj LIKE %?1%", nativeQuery = true)
    List<Empresa> buscarEmpresaPorCnpj(String cnpj);
}
