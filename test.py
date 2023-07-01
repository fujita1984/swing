from pyjab.jabdriver import JABDriver

# windowをセット
jabdriver = JABDriver("Outer Window")

# テキストエリアに入力
textarea = jabdriver.find_element_by_role("text")
textarea.send_text("hello world")

# ボタンを押す
btn = jabdriver.find_element_by_name("Button")
btn.click()

