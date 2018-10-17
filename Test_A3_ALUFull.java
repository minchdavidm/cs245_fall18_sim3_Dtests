
public class Test_A3_ALUFull
{
	public static void main(String[] args)
	{
		Sim3_ALU aluUnit = new Sim3_ALU(2);


		aluUnit.aluOp[0].set(false);
		aluUnit.aluOp[1].set(false);
		aluUnit.aluOp[2].set(false);
		aluUnit.bNegate.set(false);
		aluUnit.a[0].set(true);
                aluUnit.a[1].set(false);
		aluUnit.b[0].set(true);
                aluUnit.b[1].set(false);

                aluUnit.execute();

                System.out.printf("aluUnit.a.length = %d\n", aluUnit.a.length);
                System.out.printf("aluUnit.result.length = %d\n", aluUnit.result.length);
                System.out.printf("aluUnit.aluOp[2, 1, 0] = [%s, %s, %s]\n",
                                   aluUnit.aluOp[2].get(), aluUnit.aluOp[1].get(), aluUnit.aluOp[0].get());
                System.out.printf("aluUnit.execute_pass2()\n");
                System.out.printf("aluUnit.bNegate.get() = %s\n", aluUnit.bNegate.get());
                System.out.printf("aluUnit.a.get() = %s\n", bit_arr_to_string(aluUnit.a));
                System.out.printf("aluUnit.b.get() = %s\n", bit_arr_to_string(aluUnit.b));
                System.out.printf("aluUnit.result.get() = %s\n", bit_arr_to_string(aluUnit.result));
	}

        public static String bit_arr_to_string(RussWire arr[]){
                String ret = "";
                if (arr[0].get()){
                  ret = ret + "1";
                } else {
                  ret = ret + "0";
                }
                for (int i = 1; i < arr.length ; i++){
                  if (arr[i].get()){
                    ret = ret + ", 1";
                  } else {
                    ret = ret + ", 0";
                  }
                }
                return ret;
       }
}

