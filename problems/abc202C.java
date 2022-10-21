import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class abc202C {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] ai = new int[n + 1];
		for (int i = 0; i < n; i++) {
			ai[Integer.parseInt(st.nextToken())]++;
		}
		st = new StringTokenizer(br.readLine());
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(st.nextToken()) - 1;
		}
		int[] bcj = new int[n + 1];
		for (int i = 0; i < n; i++) {
			bcj[b[c[i]]]++;
		}

		long cnt = 0;
		for (int i = 0; i < n + 1; i++) {
			cnt += (long)ai[i] * (long)bcj[i];
		}

		pw.print(cnt);
		br.close();
		pw.close();
	}
}
