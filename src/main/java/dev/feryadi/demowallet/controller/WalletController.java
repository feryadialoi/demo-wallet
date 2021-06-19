package dev.feryadi.demowallet.controller;

import dev.feryadi.demowallet.model.request.CreateWalletRequest;
import dev.feryadi.demowallet.model.request.UpdateWalletRequest;
import dev.feryadi.demowallet.model.response.WalletResponse;
import dev.feryadi.demowallet.service.WalletService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wallets")
@AllArgsConstructor
public class WalletController {

    private final WalletService walletService;

    @GetMapping
    public ResponseEntity<List<WalletResponse>> getWallets(Pageable pageable) {
        return new ResponseEntity<>(walletService.getWallets(pageable), HttpStatus.OK);
    }

    @GetMapping("/{walletId}")
    public ResponseEntity<WalletResponse> getWallet(@PathVariable("walletId") Long walletId) {
        return ResponseEntity.ok(walletService.getWallet(walletId));
    }

    @PostMapping
    public ResponseEntity<WalletResponse> createWallet(@RequestBody CreateWalletRequest createWalletRequest) {
        return ResponseEntity.ok(walletService.createWallet(createWalletRequest));
    }

    @PutMapping("/{walletId}")
    public ResponseEntity<WalletResponse> updateWallet(
            @PathVariable("walletId") Long walletId,
            @RequestBody UpdateWalletRequest updateWalletRequest) {
        return ResponseEntity.ok(walletService.updateWallet(walletId, updateWalletRequest));
    }

    @DeleteMapping("/{walletId}")
    public ResponseEntity<WalletResponse> deleteWallet(
            @PathVariable("walletId") Long walletId) {
        return ResponseEntity.ok(walletService.deleteWallet(walletId));
    }
}
