package com.teach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class MainJava {

	public static void main(String[] args) {

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Project[] project = new Project[2];

			HashMap<Integer, Project> hm = new HashMap<>();

			for (int i = 0; i < 2; i++) {
				Employee emp = new Employee();
				System.out.println("employee datils");
				System.out.println(" enter employee id");

				int eid = Integer.parseInt(br.readLine());
				emp.setEid(eid);

				System.out.println("enter the name");

				String ename = br.readLine();
				emp.setEname(ename);

				System.out.println("enter the role");

				String erole = br.readLine();
				emp.setErole(erole);

				ArrayList<Employee> all = new ArrayList<>();
				all.add(emp);

				System.out.println("entr project details");
				System.out.println("enter the projectid");

				int pid = Integer.parseInt(br.readLine());
				project[i] = new Project();
				project[i].setPid(pid);

				System.out.println("enter project name");

				String pname = br.readLine();
				project[i].setPname(pname);
				project[i].setAl(all);

				hm.put(pid, project[i]);
				System.out.println("details of projet and employee are below" + hm);

				int enterid = Integer.parseInt(br.readLine());
				if (hm.containsKey(enterid)) {
					System.out.println(hm.get(enterid));

				}

			}
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
