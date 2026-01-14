package com.tree.traversalapplication;

import java.util.ArrayList;

//Represents a directory or file in file system tree
public class FileNode {

	String name; // directory or file name
	ArrayList<FileNode> children; // subdirectories/files

	// Constructor
	FileNode(String name) {
		this.name = name;
		this.children = new ArrayList<>();
	}

	// Add child directory/file
	void addChild(FileNode child) {
		children.add(child);
	}
}
