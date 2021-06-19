package dev.feryadi.demowallet.modelmapperimpl;

import dev.feryadi.demowallet.entity.Wallet;
import dev.feryadi.demowallet.model.response.WalletResponse;
import dev.feryadi.demowallet.modelmapper.WalletMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class WalletMapperImpl implements WalletMapper {
    @Override
    public WalletResponse mapWalletToWalletResponse(Wallet wallet) {
        return WalletResponse.builder()
                .id(wallet.getId())
                .address(wallet.getAddress())
                .balance(wallet.getBalance())
                .build();
    }
}
