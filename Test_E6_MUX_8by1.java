/* testcase for Hardware Project 3
 * author: David Minch
 */

public class Test_E6_MUX_8by1 
{
	public static void main(String[] args)
	{
		Sim3_MUX_8by1   mux     = new Sim3_MUX_8by1();
                boolean         result;

                mux.control[0].set(true);
                mux.control[1].set(false);
                mux.control[2].set(true);
                mux.in[0].set(false);
                mux.in[1].set(false);
                mux.in[2].set(false);
                mux.in[3].set(false);
                mux.in[4].set(false);
                mux.in[5].set(true);
                mux.in[6].set(false);
                mux.in[7].set(false);
                mux.execute();


                System.out.printf("mux.control.length = %d\n", mux.control.length);
                System.out.printf("mux.in.length = %d\n", mux.in.length);
                System.out.printf("mux.control[2, 1, 0]: [%s, %s, %s]\n",
                                   mux.control[2], mux.control[1], mux.control[0]);
                System.out.printf("mux.in[7, 6, 5, 4, 3, 2, 1, 0]: [%s, %s, %s, %s, %s, %s, %s, %s]\n",
                                   mux.in[7], mux.in[6], mux.in[5], mux.in[4], mux.in[3], mux.in[2], mux.in[1], mux.in[0]);
                System.out.printf("mux.out.get() = %s\n", mux.out.get());
	}
}

