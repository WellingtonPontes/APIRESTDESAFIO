package one.digital.inovation.one.me.model;

import java.math.BigDecimal;

import jakarta.persistence.*;



@Entity(name = "tb_Conta")
public class Account{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String Number;

    private String Agencia;

    @Column(precision = 13, scale = 2)
    private BigDecimal balance;
    // saldo

    @Column(name = "additional_limit", precision = 13, scale = 2)
    private BigDecimal Limite;

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLimite() {
        return Limite;
    }

    public void setLimite(BigDecimal limite) {
        Limite = limite;
    }

    

   


}
