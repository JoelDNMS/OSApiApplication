
package joel.OSApiApplication.domain.repository;

import java.util.List;
import joel.OSApiApplication.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sesideva
 */
@Repository
    public interface ClienteRepository extends JpaRepository<Cliente, Long> {
        
        List<Cliente> findByNome(String nome);
        List<Cliente> findByNomeContaining(String nome);
        Cliente findByEmail(String email);
        
    }
