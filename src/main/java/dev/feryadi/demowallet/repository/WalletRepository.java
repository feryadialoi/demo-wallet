package dev.feryadi.demowallet.repository;

import dev.feryadi.demowallet.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
}
