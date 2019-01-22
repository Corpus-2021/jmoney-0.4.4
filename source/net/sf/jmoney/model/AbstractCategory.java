/*
 *
 *  JMoney - A Personal Finance Manager
 *  Copyright (c) 2002 Johann Gyger <johann.gyger@switzerland.org>
 *
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *
 */

package net.sf.jmoney.model;

/**
 * An implementation of the Category interface
 */
public abstract class AbstractCategory implements Category {

	protected CategoryNode categoryNode = new CategoryNode(this);

	public String getFullCategoryName() {
		return getCategoryName();
	}

	/**
	 * @return the category tree node
	 */
	public CategoryNode getCategoryNode() {
		return categoryNode;
	}

	public void setCategoryNode(CategoryNode aCategoryNode) {
		categoryNode = aCategoryNode;
	}

	public String toString() {
		return getCategoryName();
	}

	public int compareTo(Object o) {
		Category c = (Category) o;
		return getCategoryName().compareTo(c.getCategoryName());
	}

}
