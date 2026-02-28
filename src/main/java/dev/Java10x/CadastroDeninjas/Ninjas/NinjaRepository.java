package dev.Java10x.CadastroDeninjas.Ninjas;
import dev.Java10x.CadastroDeninjas.Missoes.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}
