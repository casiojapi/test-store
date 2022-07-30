package casiojapi.onlinestore.repository;

import casiojapi.onlinestore.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
