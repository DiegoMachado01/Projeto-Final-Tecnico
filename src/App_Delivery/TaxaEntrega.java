/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App_Delivery;

/**
 *
 * @author Diego
 */
public class TaxaEntrega implements TaxaDeEntrega {

    private int taxa;

    public int getTaxa() {
        return taxa;
    }

    @Override
    public void taxaEntrega(int tipotaxa, int quantidade) {
        if (tipotaxa == 1) {
            this.taxa += tipotaxa * quantidade;
        }
        if (tipotaxa == 2) {
            this.taxa += tipotaxa * quantidade;
        }
    }
}
