package com.spock1

import spock.lang.Specification

class AddSpec extends Specification {
	def "Add two numbers"() {
		when: "Initialization class"
		def add = new Add()
		then: "sum of two numbers"
		add.Add(1,2) == 3
	}

	def "Add 2 two numbers"() {
		when: "Initialization class"
		def add = new Add()
		then: "sum of two numbers"
		add.Add(1,2) == 3
	}
}
