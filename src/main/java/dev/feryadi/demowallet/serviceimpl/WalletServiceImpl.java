package dev.feryadi.demowallet.serviceimpl;

import dev.feryadi.demowallet.entity.Wallet;
import dev.feryadi.demowallet.model.request.CreateWalletRequest;
import dev.feryadi.demowallet.model.request.UpdateWalletRequest;
import dev.feryadi.demowallet.model.response.WalletResponse;
import dev.feryadi.demowallet.modelmapper.WalletMapper;
import dev.feryadi.demowallet.repository.WalletRepository;
import dev.feryadi.demowallet.service.WalletService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class WalletServiceImpl implements WalletService {

    private final WalletRepository walletRepository;
    private final WalletMapper walletMapper;

    @Override
    public List<WalletResponse> getWallets(Pageable pageable) {
        Page<Wallet> all = walletRepository.findAll(pageable);

        List<Wallet> wallets = all.get().collect(Collectors.toList());

        return wallets.stream()
                .map(walletMapper::mapWalletToWalletResponse)
                .collect(Collectors.toList());
    }

    @Override
    public WalletResponse getWallet(Long walletId) {
        return null;
    }

    @Override
    public WalletResponse createWallet(CreateWalletRequest createWalletRequest) {
        return null;
    }

    @Override
    public WalletResponse updateWallet(Long walletId, UpdateWalletRequest updateWalletRequest) {
        return null;
    }

    @Override
    public WalletResponse deleteWallet(Long walletId) {
        return null;
    }
}
