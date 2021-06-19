package dev.feryadi.demowallet.modelmapper;

import dev.feryadi.demowallet.entity.Wallet;
import dev.feryadi.demowallet.model.response.WalletResponse;

public interface WalletMapper {
    WalletResponse mapWalletToWalletResponse(Wallet wallet);
}
