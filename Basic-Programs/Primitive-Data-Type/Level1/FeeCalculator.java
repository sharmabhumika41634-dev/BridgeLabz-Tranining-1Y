  pubic class FeeCalculator{
  pubic Static void main (String[] agrs){
  double fee = 125000;
  double discountpercen = 10;
  double discount = fee*(discountpercen/100);
  double finalfee = fee-discount;
   System.out.println("The discount amount is INR " + discount + "and final discountfee is INR " + finalfee);
}
}   