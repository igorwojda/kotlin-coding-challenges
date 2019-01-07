package com.igorwojda.datastructure.tree.basic

import org.amshove.kluent.shouldEqual
import org.junit.Test

//class TreeTest {
//    @Test
//    fun `Node has a data and children properties`() {
//        val n = Node("a")
//        n.data shouldEqual "a")
//        n.children.length shouldEqual 0)
//    }
//
//    @Test
//    fun `Node can add children`() {
//        val n = Node("a")
//        n.add("b")
//        n.children.length shouldEqual 1)
//        n.children[0].children shouldEqual [])
//    }
//
//    @Test
//    fun `Node can remove children`() {
//        val n = Node("a")
//        n.add("b")
//        n.children.length shouldEqual 1)
//        n.remove("b")
//        n.children.length shouldEqual 0)
//    }
//
//    @Test
//    fun `starts empty`() {
//        val t = Tree()
//        t.root shouldEqual null)
//    }
//
//    @Test
//    fun `Can traverse bf`() {
//        val letters = []
//        val t = Tree()
//        t.root = Node("a")
//        t.root.add("b")
//        t.root.add("c")
//        t.root.children[0].add("d")
//
//        t.traverseBF(node => {
//            letters.push(node.data)
//        }
//
//        letters shouldEqual ["a", "b", "c", "d"])
//    }
//
//    @Test
//    fun `Can traverse DF`() {
//        val letters = []
//        val t = Tree()
//        t.root = Node("a")
//        t.root.add("b")
//        t.root.add("d")
//        t.root.children[0].add("c")
//
//        t.traverseDF(node => {
//            letters.push(node.data)
//        }
//
//        letters shouldEqual ["a", "b", "c", "d"])
//    }
//}
