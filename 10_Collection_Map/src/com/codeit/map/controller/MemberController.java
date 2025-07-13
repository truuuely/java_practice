package com.codeit.map.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.codeit.map.model.Member;

public class MemberController {
	private final Map<String, Member> map = new HashMap<>();
	
	public MemberController() {
		map.put("test1", new Member("1234", "홍길동"));
		map.put("test2", new Member("1234", "홍길동"));
		map.put("test3", new Member("1234", "홍길동"));
		map.put("test4", new Member("1234", "홍길동"));
		map.put("test5", new Member("1234", "홍길동"));
	}

	public boolean joinMembership(String id, Member m) {
		if (map.containsKey(id)) {
			return false;
		}

		map.put(id, m);
		return true;
	}

	public String login(String id, String password) {
		String memberName = null;

		if (map.containsKey(id)) {
			Member member = map.get(id);
			if (member.getPassword().equals(password)) {
				memberName = member.getName();
			}
		}

		return memberName;
	}

	public boolean changePassword(String id, String oldPw, String newPw) {
		if (map.containsKey(id)) {
			Member member = map.get(id);

			if (member.getPassword().equals(oldPw)) {
				member.setPassword(newPw);
				return true;
			}
		}

		return false;
	}

	public boolean changeName(String id, String newName) {
		try {
			map.get(id).setName(newName);
		} catch (Exception e) {
			return false;
		}

		return true;
	}

	public TreeMap<String, Member> sameName(String name) {
		TreeMap<String, Member> memberById = new TreeMap<>();

		for (String id : map.keySet()) {
			if (map.get(id).getName().equals(name)) {
				memberById.put(id, map.get(id));
			}
		}

		return memberById;
	}
}















