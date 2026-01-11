package com.browserbuddy;

import java.util.Stack;

// Manages closed tabs using Stack
public class BrowserManager {

	// Stack to store closed tabs
    private Stack<TabHistory> closedTabs;

    public BrowserManager() {
        closedTabs = new Stack<>();
    }

    // Close current tab
    public void closeTab(TabHistory tab) {
        if (tab != null) {
            closedTabs.push(tab);
            System.out.println("Tab closed.");
        }
    }

    // Reopen last closed tab
    public TabHistory reopenTab() {
        if (!closedTabs.isEmpty()) {
            System.out.println("Reopened last closed tab.");
            return closedTabs.pop();
        } else {
            System.out.println("No closed tabs to reopen.");
            return new TabHistory();
        }
    }
}
