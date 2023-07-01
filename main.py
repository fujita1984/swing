from pyjab.jabdriver import JABDriver

# Create a JABDriver object.
jabdriver = JABDriver("Outer Window")

# Find a JABElement by element name
btn = jabdriver.find_element_by_name("Button")
btn.click()

textarea = jabdriver.find_element_by_role("text").send_text("hello world")