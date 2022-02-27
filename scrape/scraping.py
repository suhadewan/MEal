from serpapi import GoogleSearch

params = {
  "q": "recipe",
  "location": "Austin,Texas,United States,United Kingdom",
  "hl": "en",
  "gl": "us",
  "api_key": "secret_api_key"
}

search = GoogleSearch(params)
results = search.get_dict()
recipes_results = results['recipes_results']