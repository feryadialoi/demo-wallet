package dev.feryadi.demowallet.model.request;

import lombok.*;

/**
 * POJO / JAVA BEAN
 * class holding data
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateWalletRequest {
    private Long id;
    private String address;
}
