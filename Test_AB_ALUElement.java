
public class Test_AB_ALUElement
{
	public static void main(String[] args)
	{
		Sim3_ALUElement aluElem = new Sim3_ALUElement();


		aluElem.aluOp[0].set(false);
		aluElem.aluOp[1].set(false);
		aluElem.aluOp[2].set(false);
		aluElem.bInvert.set(false);
		aluElem.a.set(false);
		aluElem.b.set(false);
		aluElem.carryIn.set(false);
		aluElem.less.set(false);

                aluElem.execute_pass1();
                aluElem.execute_pass2();

                System.out.printf("aluElem.aluOp.length = %d\n", aluElem.aluOp.length);
                System.out.printf("aluElem.aluOp[2, 1, 0] = [%s, %s, %s]\n",
                                   aluElem.aluOp[2].get(), aluElem.aluOp[1].get(), aluElem.aluOp[0].get());
                System.out.printf("aluElem.bInvert.get() = %s\n", aluElem.bInvert.get());
                System.out.printf("aluElem.a.get() = %s\n", aluElem.a.get());
                System.out.printf("aluElem.b.get() = %s\n", aluElem.b.get());
                System.out.printf("aluElem.addResult.get() = %s\n", aluElem.addResult.get());
                System.out.printf("aluElem.carryOut.get() = %s\n", aluElem.carryOut.get());
                System.out.printf("aluElem.result.get() = %s\n", aluElem.result.get());
	}
}

