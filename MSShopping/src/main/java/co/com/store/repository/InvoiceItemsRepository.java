package co.com.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.store.entity.InvoiceItem;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem, Long> {

}