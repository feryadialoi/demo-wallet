package dev.feryadi.demowallet.service;

import dev.feryadi.demowallet.model.request.CreateWalletRequest;
import dev.feryadi.demowallet.model.request.UpdateWalletRequest;
import dev.feryadi.demowallet.model.response.WalletResponse;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface WalletService {

    List<WalletResponse> getWallets(Pageable pageable);

    WalletResponse getWallet(Long walletId);

    WalletResponse createWallet(CreateWalletRequest createWalletRequest);

    WalletResponse updateWallet(Long walletId, UpdateWalletRequest updateWalletRequest);

    WalletResponse deleteWallet(Long  walletId);

}
